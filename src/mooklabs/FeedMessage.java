package mooklabs;

/*
 * Represents one RSS message
 */
public class FeedMessage {

	public String title;
	public String description;
	public String link;
	public String author;
	public String version;
	public String picLink;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = "https://www.youtube.com/channel/UCEvf_oE_FG9gNSCd7iUG7JA";//link;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "FeedMessage [title=" + title + ", description=" + description
				+ ", link=" + link + ", author=" + author+ ", version=" + version;
	}

}