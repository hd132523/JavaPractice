package org.dimigo.exception;

public class AgeCheckException extends Exception{
	public AgeCheckException(){
		
	}
	public AgeCheckException(Movie movie) throws Exception{
		super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가입니다.");
		
	}
}
