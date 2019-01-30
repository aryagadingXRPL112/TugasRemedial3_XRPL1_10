import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
 
/**
 *
 * @author www.kangsunu.web.id
 */
public class SelisihTanggal {
    public static void main(String[] args) {
             
        String stglAwal = "2019-10-05";
        String stglAkhir = "2019-11-01";
        DateFormat dateAwal = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateAkhir = new SimpleDateFormat("yyyy-MM-dd");
         
        try {
            Date tglAwal = dateAwal.parse(stglAwal);
            Date tglAkhir = dateAkhir.parse(stglAkhir);
             
            Date TGLAwal = tglAwal;
            Date TGLAkhir = tglAkhir;
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(TGLAwal);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(TGLAkhir);
             
            String hasil = String.valueOf(daysBetween(cal1, cal2));
             
            System.out.println("Tanggal Awal  = " +stglAwal);
            System.out.println("Tanggal Akhir = " +stglAkhir);
            System.out.println("Selisih: " +hasil+ " hari");
             
        } catch (ParseException e) {
        }
    }
     
    private static long daysBetween(Calendar tanggalAwal, Calendar tanggalAkhir) {
        long lama = 0;
        Calendar tanggal = (Calendar) tanggalAwal.clone();
        while (tanggal.before(tanggalAkhir)) {
            tanggal.add(Calendar.DAY_OF_MONTH, 1);
            lama++;
        }
        return lama;
    }
}