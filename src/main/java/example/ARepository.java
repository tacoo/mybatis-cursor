package example;

import java.io.IOException;
import java.util.Iterator;

import org.apache.ibatis.cursor.Cursor;
import org.springframework.stereotype.Repository;

@Repository
public class ARepository {

	private final AMapper aMapper;

	public void whyCursorWhy() {
		cursor();
		resultHandler();
	}

	private void cursor() {
		System.out.println("read via cursor started");
		try (Cursor<String> cur = aMapper.viaCursor()) {
			Iterator<String> iterator = cur.iterator();
			System.out.println("cursor has next: " + iterator.hasNext());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("read via cursor finished");
	}

	private void resultHandler() {
		System.out.println("read via resultHandler started");
		aMapper.viaResultHander(ctx -> {
			System.out.println("resultHandler size: " + ctx.getResultCount());
		});
		System.out.println("read via resultHandler finished");

	}

	public ARepository(AMapper aMapper) {
		super();
		this.aMapper = aMapper;
	}

}
