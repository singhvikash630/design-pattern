package com.jspider.spring.creational.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> books=new ArrayList<Book>();
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public void loadData(){       
        for (int i = 0; i < 10; i++) {
            Book book=new Book();
            book.setBid(i);
            book.setNname("Book"+i);
            books.add(book);
        }
    }
    
    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", books=" + books + "]";
    }
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bs=new BookShop();
        for (Book book : books) {
            bs.getBooks().add(book);
        }
        return bs;
    }
    
    


}
