package com.molleapaza.bookmarkerapi.api;

import com.molleapaza.bookmarkerapi.domain.Bookmark;
import com.molleapaza.bookmarkerapi.domain.BookmarkService;
import com.molleapaza.bookmarkerapi.domain.BookmarksDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getBookmark(@RequestParam(name = "page", defaultValue = "1") Integer page){
        return bookmarkService.getBookmark(page);
    }
}
