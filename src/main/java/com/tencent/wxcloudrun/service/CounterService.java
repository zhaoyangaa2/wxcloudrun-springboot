package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Counter;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public interface CounterService {

  Optional<Counter> getCounter(Integer id);

  void upsertCount(Counter counter);

  void clearCount(Integer id);
}
