package ibrahim.aytimur.try_catch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ArithmeticException
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // try - catch + finally
        var sayi1 = 15
        var sayi2 = 0

        try {
            var sonuc = sayi1 / sayi2
            textView.text = sonuc.toString()
        }catch (a:ArithmeticException){
            textView.text=a.message
        }

        var deger1 = "15"
        var deger2 = "3a"

        try {
            var toplam = deger1.toInt() + deger2.toInt()
            textView.text = toplam.toString()
        }catch (e:Exception){
            textView.text ="Veritipi dönüşüm hatası"+"\n"+e.message
        }
        finally {
           // textView.text = "Finally sürekli çalışır"
        }
    }
}
/*
ArithmeticException	Aritmatiksel bir işlem sırasında oluşan hata
ArrayIndexOutOfBoundsException	Array sınırlarından çıkılma hatası
ArrayStoreException	Array yapısına uymayan bir değer kaydedilmeye çalışıldığında
ClassCastException	Uygunsuz class atama işlemi
IllegalArgumentException	Uygun olmayan argüman kullanımı
IllegalMonitorStateException	Uygun olmayan monitör işlemi
IllegalStateException	Sistemin uygun pozisyonda olmadığını belirtir
IllegalThreadStateException	Tread durumunun uygun olmadığını belirtir
IndexOutOfBoundsException	Index'in sınırlardan çıkılma hatası
NegativeArraySizeException	Array'in boyutuna negatif değer verilmiş olması hatası
NullPointerException	Boş pointer hatası
NumberFormatException	Uygun olmayan sayı formatı hatası
SecurityException	Güvenlik hatası
StringIndexOutOfBounds	String yapısının sınırlarından çıkma hatası
UnsupportedOperationException	Desteklenmeyen işlem hatası
ClassNotFoundException	Class bulunmama hatası
CloneNotSupportedException	Çoğalmaya çalışılan bir objenin çoğalamayacağını belirten hata
IllegalAccessException	Uygunsuz erişim hatası
InstantiationException	Bir objenin oluşturulması esnasında oluşan hata
InterruptedException	Bir tread'in diğer tread'i durdurma hatası
NoSuchFieldException	Aranılan alanın olmadığı hatası
NoSuchMethodException	Kullanılan methodun bulunmama hatası

 */