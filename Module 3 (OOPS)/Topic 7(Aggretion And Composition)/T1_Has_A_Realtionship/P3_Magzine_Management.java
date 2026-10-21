package T1_Has_A_Realtionship;

class Article {
	String title;
	String content;
	
	void displayArticleDetails() {
		System.out.println("Article Title: " + title);
		System.out.println("Article Content: " + content);
	}
}
	
class Magazine {
	Article featuredArticle = new Article();
	
	void displayFeaturedArticle() {
		featuredArticle.displayArticleDetails();
	}
}

public class P3_Magzine_Management {
	public static void main(String[] args) {
		Magazine myMagazine = new Magazine();
		myMagazine.featuredArticle.title = "Exploring Java";
		myMagazine.featuredArticle.content = "Java is a versatile and powerful programming language...";
		myMagazine.displayFeaturedArticle();
		}
}
