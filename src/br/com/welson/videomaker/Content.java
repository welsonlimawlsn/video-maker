package br.com.welson.videomaker;

import java.util.Scanner;

public class Content {

    private String searchTerm;
    private String prefix;
    private Scanner scanner;

    private Content() {
        scanner = new Scanner(System.in);
    }

    public static Content initContent() {
        Content content = new Content();
        content.askSearchTerm();
        content.askPrefix();
        return content;
    }

    private void askSearchTerm() {
        System.out.print("Type a Wikipedia search term: ");
        searchTerm = scanner.nextLine();
    }

    private void askPrefix() {
        String[] prefixes = {"Who is", "What is", "The history of"};
        System.out.println("Choice an option: ");
        for (int i = 0; i < prefixes.length; i++) {
            System.out.println((i + 1) + " - " + prefixes[i]);
        }
        prefix = prefixes[Integer.parseInt(scanner.nextLine()) - 1];
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "Content{" +
                "searchTerm='" + searchTerm + '\'' +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}
