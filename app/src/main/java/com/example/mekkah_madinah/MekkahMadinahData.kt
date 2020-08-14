package com.example.mekkah_madinah

object MekkahMadinahData {
    private val MekkahMadinahNames = arrayOf(
        "Masjid Nabawi",
        "Makam Rasulullah",
        "Raudhah",
        "Mighrab",
        "Baqi",
        "Masjid Quba",
        "Kebun Kurma",
        "Jabal Uhud",
        "Masjid Qiblatain",
        "Masjidil Haram",
        "Jabal Tsur",
        "Jabal Nur",
        "Jabal Rahmah"
    )
    private val MekkahMadinahLokasi = arrayOf(
        "Haram, Madinah, Hejaz, Arab Saudi",
        "Kubah Hijau, Masjid Nabawi, Madinah, Arab Saudi",
        "Masjid Nabawi, Madinah, Arab Saudi",
        "Masjid Nabawi, Madinah, Arab Saudi",
        "Seberang Masjid Nabawi, Madinah, Arab Saudi",
        "5 km di sebelah tenggara kota Madinah, Arab Saudi",
        "Timur Masjid Quba, Madinah, Arab Saudi",
        "Utara Madinah, Arab Saudi",
        "bukit kecil di utara Harrah Wabrah, Madinah, Arab Saudi",
        "Al Haram, Mekkah, Arab Saudi",
        "selatan distrik Al-Misfalah, Mekkah, Arab Saudi",
        "Hejaz, Mekkah, Arab Saudi",
        "sebelah timur luar kota suci umat Islam di Mekkah, Arab Saudi"

    )
    private val MekkahMadinahDetails = arrayOf(
        "Masjid Nabawi atau Al-Masjid an-Nabawī ( (bahasa Arab: المسجد النبوي\u200E); Masjid Nabi) adalah sebuah masjid yang didirikan secara langsung oleh Nabi Muhammad, berlokasi di pusat kota Madinah di Arab Saudi. Masjid Nabawi merupakan masjid ketiga yang dibangun dalam sejarah Islam dan kini menjadi salah satu masjid terbesar di dunia. Masjid ini menjadi tempat paling suci kedua dalam agama Islam, setelah Masjidil Haram di Mekkah.[2] Masjid ini dibuka setiap hari.",
        "Makam Muhammad adalah makam Nabi dan Rasul Islam Muhammad, di kompleks Masjid Nabawi, Saudi Arabia. Sebelum diperluas, di situ terdapat makam Muhammad yang dulu dinamakan Masqurah. Setelah masjid ini diperluas, makam Muhammad masuk di dalam bangunan masjid dengan kubah berwarna hijau. Di situ, terdapat empat pintu yang masing-masing dinamakan Pintu at-Taubah di kiblatnya, Pintu ar-Raudhah di barat, Pintu Fathimah di timur, dan Pintu Tahajud di utara. Selain itu, di sini ada pula makam Abu Bakar dan Umar bin Khattab.",
        "Salah satu bagian Masjid Nabawi terkenal dengan sebutan Raudlah (taman surga). Doa-doa yang dipanjatkan dari Raudlah ini diyakini akan dikabulkan oleh Allah.",
        "Terdapat dua mihrab dalam Masjid Nabawi, satu dibangun Nabi Muhammad dan yang lainnya dibangun oleh Khulafaur Rasyidin ketiga Utsman. [46] Disamping mihrab, masjid juga memiliki tempat suci lain lain yang mengindikasikan sebagai tempat salat. Ini termasuk mihrab al-tahajjud yang dibangun oleh Muhammad untuk tahajjud, serta mihrab Fatimah.",
        "Jannatul-Baqī‘ (bahasa Arab: جنة البقيع\u200E) adalah pemakaman utama yang terletak di Madinah, Arab Saudi, berseberangan dengan Masjid Nabawi di mana Nabi Muhammad dikuburkan. Di pemakaman ini banyak terdapat keluarga serta sahabat Nabi Muhammad yang dikuburkan. Jannatul-Baqī‘ berarti Taman Surga, juga dikenal dengan nama Baqī` al-Gharqad. Baqī` berarti tanah di mana akar pohon yang berbeda ditanam dan al-Garqhad adalah nama dari sebuah pohon berduri (Boxthorn) yang berlimpah di Baqi'. Pohon ini berjenis Lycium shawii (Bahasa Arab:Alaosaj) spesies dari Boxthorn.",
        "Masjid Quba adalah masjid pertama yang dibangun oleh Rasulullah saw. pada tahun 1 Hijriyah atau 622 Masehi di Quba, Meskipun sangat sederhana, Masjid Quba boleh dianggap sebagai contoh bentuk daripada masjid-masjid yang didirikan orang di kemudian hari. Bangunan yang sangat bersahaja itu sudah memenuhi syarat-syarat yang perlu untuk pendirian masjid. Ia sudah mempunyai suatu ruang yang persegi empat dan berdinding di sekelilingnya.",
        "Kebun kurma Madinah saat ini seolah menjadi agenda kunjungan “wajib” para jamaah umroh dan haji. Disinilah para jamaah berburu aneka jenis buah korma beserta produk olahan nya, serta tentu saja sebagai arena atau spot foto yang bagus untuk selfie.",
        "Gunung ini adalah lokasi pertempuran kedua antara Muslim dan pasukan Mekah. Pertempuran Uhud terjadi pada tanggal 23 Maret 625 Masehi, antara sejumlah kecil komunitas Muslim dari Madinah, tempat di barat laut Jazirah Arab, dengan kekuatan dari Mekah.",
        "Masjid Qiblatain (artinya: masjid dua kiblat) adalah salah satu masjid terkenal di Madinah. Masjid ini mula-mula dikenal dengan nama Masjid Bani Salamah, karena masjid ini dibangun di atas bekas rumah Bani Salamah.",
        "Masjidilharam, Masjid al-Haram atau al-Masjid al-Haram (bahasa Arab: المسجد الحرام, pengucapan bahasa Arab: [ʔælmæsʤɪd ælħaram]) adalah sebuah masjid yang berlokasi di pusat kota Makkah yang dipandang sebagai tempat tersuci bagi umat Islam. Masjid ini juga merupakan tujuan utama dalam ibadah haji. Masjid ini dibangun mengelilingi Ka'bah yang menjadi arah kiblat bagi umat Islam dalam mengerjakan ibadah salat.",
        "Jabal Tsur (bahasa Arab: جبل ثور) (Gunung Banteng) adalah nama sebuah gunung di Arab Saudi, Gunung ini terkenal karena menyimpan sebuah gua yang dikenal sebagai Ghar al-Thawr (Gua Banteng), di mana Nabi Muhammad dan rekannya Abu Bakar mengambil perlindungan dari orang Quraisy, saat migrasi ke Madinah. Bagi kebanyakan umat Islam, gua tersebut memiliki makna religius, dan oleh karenanya banyak dikunjungi peziarah dan turis.",
        "Jabal an-Nuur (disebut juga Jabal an-Nur atau Jabal Nur), atau diartikan dalam bahasa Arab جبل النور sebagai Gunung Cahaya, Arab Saudi Gunung ini menjadi salah satu tempat yang paling istimewa dan sering dikunjungi di kota Mekkah. Di gunung ini terdapat sebuah goa kecil berukuran 1,75 hasta yang dikenal sebagai Ghar Hira atau goa Hira.[2] Gunung ini memiliki tinggi 640 meter. Gunung ini juga dipercaya umat Muslim sebagai tempat di mana Nabi Muhammad menerima wahyu pertama dari Allah melalui Malaikat Jibril.",
        "Jabal Rahmah, sebuah bukit tempat bertemunya kembali Nabi Adam dan Siti Hawa setelah berpisah ratusan tahun, usai diturunkan ke bumi dari surga karena memakan buah terlarang, khuldi. Padahal Allah telah melarang mereka, tapi setan terus menggoda. Begitu riwayat tertulis dalam kitab suci Alquran."
    )

    private val MekkahMadinahImages = arrayOf(
        R.drawable.masjid_nabawi,
        R.drawable.makam_rasulullah,
        R.drawable.raudhah,
        R.drawable.mihrab_nabawi,
        R.drawable.baqi,
        R.drawable.masjid_quba,
        R.drawable.kebun_kurma,
        R.drawable.jabal_uhud,
        R.drawable.masjid_qiblatain,
        R.drawable.masjidil_haram,
        R.drawable.jabal_tsur,
        R.drawable.jabal_nur,
        R.drawable.jabal_rahmah
    )
    val listData: ArrayList<MekkahMadinah>
        get() {
            val list = arrayListOf<MekkahMadinah>()
            for (position in MekkahMadinahNames.indices) {
                val mekkahMadinah = MekkahMadinah()
                mekkahMadinah.name = MekkahMadinahNames[position]
                mekkahMadinah.lokasi = MekkahMadinahLokasi[position]
                mekkahMadinah.detail = MekkahMadinahDetails[position]
                mekkahMadinah.photo = MekkahMadinahImages[position]
                list.add(mekkahMadinah)
            }
            return list
        }
}
