import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String kullanici,sifre;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı ismi giriniz: ");
        kullanici  = input.nextLine();

        System.out.print("Şifreyi giriniz: ");
        sifre  = input.nextLine();

        if (kullanici.equals("Arif") && sifre.equals("Özel")) {
            System.out.println("Giriş yaptınız");
        } else if (!kullanici.equals("Arif") && !sifre.equals("Arif")) {
            System.out.println("Hatalı giriş yaptınız!\nŞifrenizi sıfırlamak istermisiniz? \n1-Evet \n2-Hayır");
            System.out.print("Seçiminiz:");

            int secim;
            secim = input.nextInt();
            if (secim == 1) {
                String NewPassword;
                Scanner yeni = new Scanner(System.in);
                System.out.print("Yeni Şifrenizi Giriniz:");
                NewPassword = yeni.nextLine();

                if (sifre.equals(NewPassword)) {
                    System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz! Şifre oluşturalamadı \nLütfen başka şifre giriniz.");
                } else if (!sifre.equals(NewPassword)) {
                    System.out.print("Yeni şifreniz Oluşturuldu.");
                }
            }
        }
    }
}








