package Tugas2;

public class LaguBingo {
    private final String[] lyrics = {
        "There was a farmer who had a dog,",
        "And Bingo was his name-o."
    };
    
    private final String[] letters = {"B", "I", "N", "G", "O"};
    
    //constructor
    public LaguBingo() {}
    public void printVerse() {
        //Agar Lirik Diprint Dulu 1x
        printLyrics();

        // Loopingan untuk print claps dan chorus setiap loop
        for (int i = 0; i <= letters.length; i++) {
            printChorus(i);
            //Berfungsi untuk print lirik setiap chorus atau setiap claps bertambah
            printLyrics();
        }
    }

    private void printLyrics() {
        System.out.println(lyrics[0]);
        System.out.println(lyrics[1]);
    }

    private void printChorus(int claps) {
        for (int i = 0; i < 3; i++) {
            // untuk melakukan loopingan print pada claps
            for (int j = 0; j < claps; j++) {
                System.out.print("(clap)-");
            }

            // untuk melakukan loopingan huruf yang tersisa
            for (int j = claps; j < letters.length; j++) {
                System.out.print(letters[j] + "-");
            }
            
            // untuk menampilkan semua huruf menjadi claps jika claps sudah sama panjang dengan huruf
            if (claps == letters.length) {
                System.out.print("(clap)");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LaguBingo song = new LaguBingo();
        
        song.printVerse();
    }
}
