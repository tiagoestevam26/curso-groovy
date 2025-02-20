
import groovy.xml.MarkupBuilder


def books = [
        [isbn: "978-1935182443", title: 'Groovy in Action 2nd Edition', author: 'Dierk Koenig', price: 50.34],
        [isbn: "978-342354234", title: '111111111', author: 'Didsfsdg', price: 102.58],
        [isbn: "978-193sdsds3", title: 'Groofdfdfdvy in Action 2nd Edition', author: 'Diedfgdfrk Koenig', price: 500.34]
]

FileWriter writer = new FileWriter('html/books.html')
MarkupBuilder builder = new MarkupBuilder(writer)

builder.html{
    head{
        title("BOOOOOKSSSS")
    }
    body{
        h1("Here they are:")
        table{
            tr{
                th("ISBN")
                th("TITLE")
                th("AUTHOR")
                th("PRICE")
            }
            books.each {book ->
                th(book.isbn)
                th(book.title)
                th(book.author)
                th(book.price)
            }
        }
    }
}