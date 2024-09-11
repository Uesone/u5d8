package UmbertoAmoroso.u5d8.payloads;

import lombok.Getter;

@Getter
public class NewBlogPostPayload {
    private final int authorId;
    private final String category;
    private final String content;
    private final double readingTime;
    private final String title;

    public NewBlogPostPayload(int authorId, String category, String content, double readingTime, String title) {
        this.authorId = authorId;
        this.category = category;
        this.content = content;
        this.readingTime = readingTime;
        this.title = title;
    }
}
