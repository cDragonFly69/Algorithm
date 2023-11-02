package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextParagraphSearch {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Michael  Dragon\\Desktop\\11.txt";  // 替换为你的文本文件路径
        String targetParagraph = "项目概况";  // 替换为你要查找的目标段落

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            StringBuilder paragraph = new StringBuilder();
            boolean isTargetParagraphFound = false;

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.trim().isEmpty()) {
                    // 遇到空行，表示段落结束
                    if (paragraph.toString().equals(targetParagraph)) {
                        isTargetParagraphFound = true;
                        break;
                    }

                    paragraph = new StringBuilder();
                } else {
                    // 继续构建段落内容
                    paragraph.append(line).append("\n");
                }
            }

            if (isTargetParagraphFound) {
                // 输出目标段落的内容
                System.out.println(paragraph);
            } else {
                System.out.println("未找到目标段落。");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到。");
        }
    }
}
