package FileWriter;

import java.io.File;
import java.io.FileWriter;

class Main {
    public static void main(String[] args) {

        /**
         * Read through the following code. Before you run it, make a prediction as to
         * what each line does. It would be wise to open the API for the File class.
         * Note: You can search for 'File', or, you can tell it is in java.io by looking
         * at the import statement at the top of the program.
         */

        try {
            File myFile = new File(
                    "C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\in-class-coding\\FileWriter\\simpleText.txt"); // you
                                                                                                                      // can
                                                                                                                      // put
                                                                                                                      // the
                                                                                                                      // complete
                                                                                                                      // file
                                                                                                                      // path,
                                                                                                                      // or
                                                                                                                      // just
                                                                                                                      // the
                                                                                                                      // file
                                                                                                                      // name.
                                                                                                                      // If
                                                                                                                      // you
                                                                                                                      // put
                                                                                                                      // the
                                                                                                                      // path,
                                                                                                                      // it
                                                                                                                      // can
                                                                                                                      // create
                                                                                                                      // a
                                                                                                                      // file
                                                                                                                      // in
                                                                                                                      // another
                                                                                                                      // folder.
            FileWriter writer = new FileWriter(myFile);
            if (myFile.createNewFile()) {
                System.out.println("new file created");
            } else {
                System.out.println("file already exists");
            }
            writer.write("Name: Scott");
            writer.write("\nAge: Almost 3 years (Jovian Years)");
            writer.write("\nIt's a dangerous business, Frodo, going out your door.");
            writer.write("\nYou step onto the road, and if you don't keep your feet,");
            writer.write("\nthere's no knowing where you might be swept off to.");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("Error >> " + e);
        }

        /**
         * Uncomment lines 34 to 39 to see what happens when you
         * try to create a file without the try-catch statement.
         */

        /**
         * Comment out the if-else block to see what happens if you
         * don't give file creation feedback.
         */

        try {
            File myFile = new File(
                    "C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\in-class-coding\\FileWriter\\noTryCatchFile.txt");
            FileWriter writer = new FileWriter(myFile);
            if (myFile.createNewFile()) {
                System.out.println("new file created");
            } else {
                System.out.println("file already exists");
            }
            writer.write("Guess what. I added try catch statements and now it works. ;-)");
            writer.flush();
            writer.close();            
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

        /**
         * Create two new files. Make sure to create a file name with a
         * .txt filename extension. I would prefer you type the entire
         * code block rather than copy/paste.
         */

        // new files here //
        try {
            File thatHasDefinitelyBeenCopied = new File(
                    "C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\in-class-coding\\FileWriter\\iamcopied.txt");
            FileWriter writer = new FileWriter(thatHasDefinitelyBeenCopied);
            if (thatHasDefinitelyBeenCopied.createNewFile()) {
                System.out.println("FILE HAS BEEN MADE MASTER SIR. YESSIR");
            } else {
                System.out.println("SOMETHING HAS GONE WRONG SIR. WE'RE GOING DOWNNNNNNN");
            }

            writer.write("I HAVE BEEN COPIED CHILD");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("OHHH MY GOD THING IS WAY TOOOOOO MUCHHHHHH. ERROR: " + e);
        }

        try {
            File thatIsNotCopied = new File(
                    "C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\in-class-coding\\FileWriter\\tisNotCopied.txt");

            if (thatIsNotCopied.createNewFile()) {
                System.out.println("FILE CREATED");
            } else {
                System.out.println("FILE IS BROKEN");
            }
            FileWriter writer = new FileWriter(thatIsNotCopied);
            writer.write("I've definitely been copied.");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        /**
         * Insert the following line of code on line 24.
         * FileWriter writer = new FileWriter(myFile);
         * It will throw an error. What is causing this error? How could you fix it?
         */

        /**
         * Move the writer line into the try block and compile your code. It should
         * work.
         * 
         * Look up the FileWriter API. It is in java.io as well. Look for the methods.
         * 
         * Do it now.
         * 
         * Notice there aren't typical methods listed. That is because FileWriter is a
         * 'subclass'
         * of another class: the Writer class. Go to the Writer class and look at its
         * methods.
         * Use a Writer method to write the following information into the file:
         * 
         * Name: Scott
         * Age: Almost 3 (Jovian years)
         * Favorite Quote:
         * "It's a dangerous business, Frodo, going out your door.
         * You step onto the road, and if you don't keep your feet,
         * there's no knowing where you might be swept off to."
         * 
         * Notice the writer doesn't actually write anything.
         * You need to flush (and maybe even close) the writer.
         * Flush means push everything from the writer into the document. Write puts
         * things in a temporary location,
         * flush actually finishes the job. It makes it so the file doesn't have to be
         * constantly accessed.
         * translation: it makes it faster and safer.
         * Close means close the 'stream' to the file. Right now a stream is just our
         * connection to the file.
         * 
         * After you're done writing, use either the flush() or close() method on your
         * writer to finish writing.
         * 
         */
    }
}