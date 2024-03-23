package com.balu.todoapp.presentation

import com.balu.todoapp.data.Note

sealed interface NotesEvent {
    data object SortNotes: NotesEvent

    data class DeleteNote(val note: Note): NotesEvent

    data class SaveNote(
        val title: String,
        val description: String
    ): NotesEvent
}