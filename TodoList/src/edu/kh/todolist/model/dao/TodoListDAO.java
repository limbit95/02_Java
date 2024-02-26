package edu.kh.todolist.model.dao;

import java.time.LocalDateTime;
import java.util.List;

public interface TodoListDAO {

	/**
	 * TodoList를 파일로 저장하는 메서드
	 */
	void saveFile() throws Exception;
	
	/** 할 일 목록 반환 DAO
	 * @return todoList
	 */
	List<Todo> todoListFullView();

	/** 할 일 추가 DAO
	 * @param todo
	 * @return 추가된 index or -1
	 */
	int todoAdd(Todo todo) throws Exception;

	Todo todoDetailView(int idx);

	/** 할 일 완료 여부 변경 DAO 
	 * @param idx
	 * @return 해당 index 요소의 완료 여부가 변경되면 true
	 * 		   index 요소가 없으면 false
	 */
	boolean todoComplete(int idx) throws Exception;

	/** 할 일 수정 DAO
	 * @param index
	 * @param title
	 * @param content
	 * @return 성공 true, 실패 false
	 */
	boolean todoUpdate(int index, String title, String content) throws Exception;

	/** 할 일 삭제 DAO
	 * @param index
	 * @return 성공 시 삭제된 할 일(Todo) 반환
	 * 		   index 범위 초과로 실패 시 null 반환
	 * @throws Exception
	 */
	Todo todoDelete(int index) throws Exception;

}