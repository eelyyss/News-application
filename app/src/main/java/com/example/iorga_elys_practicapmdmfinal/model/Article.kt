package com.example.iorga_elys_practicapmdmfinal.model
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "articles")
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,

    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source?,
    val title: String,
    val url: String,
    val urlToImage: String,
    var isViewed: Boolean = false

): Serializable{
    override fun hashCode(): Int {
        return source?.hashCode() ?: 0
    }
}
