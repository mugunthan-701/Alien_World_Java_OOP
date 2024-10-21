import java.util.Scanner; // Import Scanner class for user input

// Abstract class demonstrating Abstraction
abstract class Alien {
    private String mood; // Encapsulated field representing the alien's mood

    // Constructor to initialize the mood
    public Alien(String mood) {
        this.mood = mood;
    }

    // Getter and setter for mood (Encapsulation)
    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    // Abstract method to be implemented by subclasses
    public abstract void communicate();

    // Method that all aliens share to display their mood
    public void displayMood() {
        System.out.println("Alien mood: " + mood);
    }
}

// Subclass representing a BlobAlien with its own communication style
class BlobAlien extends Alien {
    public BlobAlien(String mood) {
        super(mood); // Call the parent constructor
    }

    @Override
    public void communicate() {
        System.out.println("BlobAlien gurgles loudly: *BLURB BLURB*");
    }
}

// Subclass representing a SoundWaveAlien with its own communication style
class SoundWaveAlien extends Alien {
    public SoundWaveAlien(String mood) {
        super(mood); // Call the parent constructor
    }

    @Override
    public void communicate() {
        System.out.println("SoundWaveAlien emits a strange frequency: ~BZZZZT~");
    }
}

// Main class to test the aliens
public class AlienWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Get mood for BlobAlien from the user
        System.out.print("Enter the mood for BlobAlien: ");
        String blobMood = scanner.nextLine();

        // Create a BlobAlien with user-provided mood
        BlobAlien blob = new BlobAlien(blobMood);
        blob.displayMood();
        blob.communicate();

        // Get mood for SoundWaveAlien from the user
        System.out.print("\nEnter the mood for SoundWaveAlien: ");
        String soundWaveMood = scanner.nextLine();

        // Create a SoundWaveAlien with user-provided mood
        SoundWaveAlien soundWave = new SoundWaveAlien(soundWaveMood);
        soundWave.displayMood();
        soundWave.communicate();

        scanner.close(); // Close the scanner
    }
}
