package class1.ex;

// 영화 리뷰 관리 v2 - 배열 사용
public class MovieReviewMain2 {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";

        // 배열 선언 및 초기화
        MovieReview[] reviews = new MovieReview[]{movie1, movie2};

        // 영화 리뷰 정보 출력
        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
