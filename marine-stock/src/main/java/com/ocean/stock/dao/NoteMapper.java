package com.ocean.stock.dao;

import java.util.List;

import com.ocean.stock.entity.Note;

public interface NoteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Note record);

    int insertSelective(Note record);

    Note selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKey(Note record);
    
    List<Note> getNotes(Note note);
    
}