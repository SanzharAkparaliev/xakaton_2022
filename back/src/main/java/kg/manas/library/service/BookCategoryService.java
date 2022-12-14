package kg.manas.library.service;

import kg.manas.library.model.BookCategoryModel;

import java.util.List;


public interface BookCategoryService {
    BookCategoryModel get(Long id);

    BookCategoryModel save(BookCategoryModel bookCategoryModel);

    List<BookCategoryModel> getAll();

}
