package UmbertoAmoroso.u5d8.payloads;

import lombok.Getter;

@Getter
public class NewBlogPostPayload {
    private int authorId;
    private String category;
    private String content;
    private double readingTime;
    private String title;

    public NewBlogPostPayload(int authorId, String category) {
        this.authorId = authorId;
        this.category = category;
        this.content = content;
        this.readingTime = readingTime;
        this.title = title;
    }
}
