<!-- Pada file ini kalian membuat coding untuk logika update / meng-edit data mobil pada showroom sesuai id-->
<?php
// (1) Jangan lupa sertakan koneksi database dari yang sudah kalian buat yaa
require 'connect.php';
// (2) Tangkap nilai "id" mobil (CLUE: gunakan GET)
$id = $_GET["id"];
    // (3) Buatkan fungsi "update" yang menerima data sebagai parameter
    $mobil = query("SELECT * FROM showroom_mobil WHERE id = '$id'")[0];

    if (isset($_POST["update"])) {
        $nama = $_POST["nama_mobil"];
        $brand = $_POST["brand_mobil"];
        $warna = $_POST["warna_mobil"];
        $tipe = $_POST["tipe_mobil"];
        $harga = $_POST["harga_mobil"];
    
        $update = "UPDATE showroom_mobil SET nama_mobil = '$nama',
                    brand_mobil = '$brand',
                    warna_mobil = '$warna',
                    tipe_mobil = '$tipe',
                    harga_mobil = '$harga'
                    WHERE id = '$id'";
        $result = mysqli_query($connect,$update);
    
        if ( $result ) {
            echo "
            <script>
                alert('DATA BERHASIL DIUBAH');
                document.location.href = 'home.php';
            </script>
            ";
        }else {
            echo "
            <script>
                alert('DATA GAGAL DIUBAH');
                document.location.href = 'update.php';
            </script>
            ";
        }
    }
        // Dapatkan data yang dikirim sebagai parameter dan simpan dalam variabel yang sesuai.
        
        // Buatkan perintah SQL UPDATE untuk mengubah data di tabel, berdasarkan id mobil

        // Eksekusi perintah SQL

        // Buatkan kondisi jika eksekusi query berhasil
        // Jika terdapat kesalahan, buatkan eksekusi query gagalnya

    // Panggil fungsi update dengan data yang sesuai

// Tutup koneksi ke database setelah selesai menggunakan database

?>