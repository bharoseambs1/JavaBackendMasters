package com.satish.multithreading.synchronization;

class UserThread extends Thread {
    Printer printer;
    String type;

    UserThread(Printer p, String t) {
        printer = p;
        type = t;
    }

    public void run() {
        if (type.equals("Document"))
            printer.printDocuments("Document");
        else
            printer.printImages("Image");
    }
}