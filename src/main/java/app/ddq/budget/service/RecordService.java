package app.ddq.budget.service;

import app.ddq.budget.dto.RecordDto;

import java.util.List;

/**
 * @Author DDQ
 * @Description TO-DO
 * @Date 2021/05/11 21:49
 */
public interface RecordService {

    void insertOne(RecordDto recordDto);

    void insertMany(List<RecordDto> recordList);

    void selectOne(RecordDto condition);

    void selectMany(RecordDto condition);

    void updateOne(RecordDto condition);

    void updateMany(RecordDto condition);

    void deleteOne(RecordDto condition);

    void deleteMany(RecordDto condition);
}
