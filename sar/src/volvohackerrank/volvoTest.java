package volvohackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class volvoTest {

	// static void getMovieTitles(String substr) {
	public static void getMovieTitles() {
		/*
		 * String[] resultArray = null ; try { String serviceURL =
		 * "https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman" ; URL
		 * url = new URL(serviceURL) ; HttpURLConnection conn = (HttpURLConnection)
		 * url.openConnection() ; conn.setRequestMethod("GET") ;
		 * conn.setRequestProperty("ACCEPT" , "application/json") ; BufferedReader br =
		 * new BufferedReader( new InputStreamReader( conn.getInputStream() ) );
		 * 
		 * String line ; StringBuilder strbuld = new StringBuilder() ; while(
		 * br.readLine() != null ){ System.out.println(br.readLine() ); line =
		 * br.readLine() ; strbuld.append(line + "\n") ; }
		 * 
		 * MovieList listofMovies = new Gson().fromJson(strbuld.toString(),
		 * MovieList.class); List<Movie> resultList = listofMovies.getdata() ;
		 * resultArray = new String[resultList.size()] ; for(int i =0 ;
		 * i<resultList.size() ; i++){ resultArray[i] = resultList.get(i).Title ;
		 * System.out.println(resultList.get(i).Title ) ; }
		 */
		// resultArray = movieNameList.toArray() ;
		// resultArray[0] = String.valueOf( strbuld.toString().length() );
		// br.close() ;
		// conn.disconnect() ;
		// }
		//
		// catch(Exception e){
		// e.printStackTrace() ;
		// }finally{
		//
		// }

		URL url;
		try {
			url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = "";
			while (null != (str = br.readLine())) {
				System.out.println(str);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// return resultArray ;

	}

	public class MovieList {
		private String Page;
		private int per_page;
		private int total;
		private int total_pages;
		private List<Movie> data;

		public void SetPage(String Page) {
			this.Page = Page;
		}

		public String getPage() {
			return Page;
		}

		public void Setper_page(int per_page) {
			this.per_page = per_page;
		}

		public int getper_page() {
			return per_page;
		}

		public void Settotal_pages(int total_pages) {
			this.total_pages = total_pages;
		}

		public int gettotal_pages() {
			return total_pages;
		}

		public void Settotal(int total) {
			this.total = total;
		}

		public int gettotal() {
			return total;
		}

		public void Setdata(List<Movie> data) {
			this.data = data;
		}

		public List<Movie> getdata() {
			return data;
		}

	}

	public class Movie {
		private String Poster;
		private String Title;
		private String Type;
		private int Year;
		private String imdbID;

		public void SetPoster(String Poster) {
			this.Poster = Poster;
		}

		public String getPoster() {
			return Poster;
		}

		public void SetTitle(String Title) {
			this.Title = Title;
		}

		public String getTitle() {
			return Title;
		}

		public void SetType(String Type) {
			this.Type = Type;
		}

		public String getType() {
			return Type;
		}

		public void SetYear(int Year) {
			this.Year = Year;
		}

		public int getYear() {
			return Year;
		}

		public void SetimdbID(String imdbID) {
			this.imdbID = imdbID;
		}

		public String getimdbID() {
			return imdbID;
		}
	}

	public static void main(String[] args) {
		getMovieTitles();

	}

}
