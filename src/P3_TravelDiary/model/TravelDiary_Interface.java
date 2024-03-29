package P3_TravelDiary.model;

import java.util.*;

//方法定義:
public interface TravelDiary_Interface {
	public void insert(TravelDiaryVO travelDiaryVO);//新增文章
	public void update(TravelDiaryVO travelDiaryVO);//修改文章
	public void delete(Integer TravelDiary_ID);//刪除文章
	public TravelDiaryVO findByPrimaryKey(Integer travelDiaryVO);//選到哪一篇文章
	public List<TravelDiaryVO> getAll(String memberid);//全部文章
	public ArrayList<String> getPic(String memberinfo);//取自己每篇文章的圖片
	public List<TravelDiaryVO> getPic2(String memberinfo);//取自己每篇文章的圖片2(這才OK)
	
}
