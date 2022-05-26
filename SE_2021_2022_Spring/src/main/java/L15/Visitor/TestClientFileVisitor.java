/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L15.Visitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author ali.nizam
 */
public class TestClientFileVisitor {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("d:\\musteriler"), new FileNameDisplayVisitor());
    }
}
