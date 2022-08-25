package com.example.fifaapp.model

data class Pagination( val page: Long,
                       val itemsPerPage: Long,
                       val hasNextPage: Boolean,
                       val hasPrevPage: Boolean) {
}