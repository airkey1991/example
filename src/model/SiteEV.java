package model;

public class SiteEV {

	private int like;
	private int dislike;
	
	public SiteEV() {
		like = 0;
		dislike = 0;
	}

	/**
	 * likeを取得します。
	 * @return like
	 */
	public int getLike() {
	    return like;
	}

	/**
	 * likeを設定します。
	 * @param like like
	 */
	public void setLike(int like) {
	    this.like = like;
	}

	/**
	 * dislikeを取得します。
	 * @return dislike
	 */
	public int getDislike() {
	    return dislike;
	}

	/**
	 * dislikeを設定します。
	 * @param dislike dislike
	 */
	public void setDislike(int dislike) {
	    this.dislike = dislike;
	}
	
}
