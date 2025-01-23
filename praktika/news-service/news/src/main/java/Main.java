import lt.vtvpmc.Article;
import lt.vtvpmc.NewsServiceImpl;

public class Main {
    public static void main(String[] args) {
        NewsServiceImpl newsService = new NewsServiceImpl();
        System.out.println(newsService.getArticles());
    }
}
