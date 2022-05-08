package com.eguia.myapplication.model

data class Repository(val musics:MutableList<Music> = ArrayList()) {

    init {
        getDataMusics()
    }

    fun getDataMusics(): List<Music> {
        musics.add(Music(1, "Sin Mirar las señales", "Relsb", "rels", "rap"))
        musics.add(Music(2, "A mi", "Relsb", "rels", "rap"))
        musics.add(Music(3, "Diles", "Relsb", "rels", "rap"))
        musics.add(Music(4, "Chica Paranormal", "Paulo londra", "londra", "rap"))
        musics.add(Music(5, "Yonaguni", "Bad Bunny", "bad", "regueton"))
        musics.add(Music(6, "La Santa", "Bad Bunny", "bad", "regueton"))
        musics.add(Music(7, "A veces", "Gonzales Genek", "gonzalo", "rap"))
        musics.add(Music(8, "Dimelo", "Gonzales Genek", "gonzalo", "rap"))
        musics.add(Music(9, "Basket Case", "Grend day", "green", "rock"))
        return musics
    }
}
