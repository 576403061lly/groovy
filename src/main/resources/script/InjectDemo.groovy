package script

/**
 * @Author: lly
 * @Date: 2023/5/28
 */

class Library {
    private List<BookSeries> bookSeriesList;
}

class BookSeries {
    private int suitNum;
    private List<Book> books;
}

class Book {
    private String name;
    private int store;
    private double price;
}

def library = new Library(
        bookSeriesList: [
                new BookSeries(suitNum: 1, books: [
                        new Book(name: "水浒传（上）", store: 1, price: 100.00),
                        new Book(name: "水浒传（中）", store: 2, price: 120.00),
                        new Book(name: "水浒传（下）", store: 3, price: 150.00),
                ]),

                new BookSeries(suitNum: 2, books: [
                        new Book(name: "三国演义（上）", store: 4, price: 100.00),
                        new Book(name: "三国演义（中）", store: 5, price: 120.00),
                        new Book(name: "三国演义（下）", store: 6, price: 150.00),
                ]),

                new BookSeries(suitNum: 3, books: [
                        new Book(name: "西游记（上）", store: 7, price: 100.00),
                        new Book(name: "西游记（中）", store: 8, price: 120.00),
                        new Book(name: "西游记（下）", store: 9, price: 150.00),
                ]),

                new BookSeries(suitNum: 4, books: [
                        new Book(name: "红楼梦（上）", store: 10, price: 100.00),
                        new Book(name: "红楼梦（中）", store: 11, price: 120.00),
                        new Book(name: "红楼梦（下）", store: 12, price: 150.00),
                ]),

                new BookSeries(suitNum: 0, books: [
                        new Book(name: "大秦帝国（上）", store: 10, price: 100.00),
                        new Book(name: "大秦帝国（中）", store: 10, price: 120.00),
                        new Book(name: "大秦帝国（下）", store: 10, price: 150.00),
                ]),
        ]
)
when: "统计图书馆丛书总库存"
def totalStore = library.bookSeriesList.inject(0) { libraryTotalStore, bookSeries ->
    libraryTotalStore + (bookSeries.suitNum > 0 ? bookSeries.books.store.sum() * bookSeries.suitNum : 0)
}
println totalStore

then: "验证库存统计正确"
totalStore == (1 + 2 + 3) * 1 + (4 + 5 + 6) * 2 + (7 + 8 + 9) * 3 + (10 + 11 + 12) * 4
println totalStore