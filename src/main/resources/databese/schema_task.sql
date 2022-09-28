CREATE TABLE projects (
  id SERIAL NOT NULL,
  name VARCHAR(255) NOT NULL,  
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  update_at TIMESTAMP DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE tasks (
  id SERIAL NOT NULL,
  name VARCHAR(255) NOT NULL,
  status VARCHAR(16) NOT NULL,
  project_id INT NOT NULL,   
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  update_at TIMESTAMP DEFAULT NULL,
  PRIMARY KEY (id)
);