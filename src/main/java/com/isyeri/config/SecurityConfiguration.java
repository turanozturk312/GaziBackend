package com.isyeri.config;

import com.isyeri.repository.OgrenciRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;


import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

