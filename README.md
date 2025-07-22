# Book Reading Log Application

A full-stack application for tracking your reading progress and managing your book collection. This application allows you to search for books using the Google Books API, add them to your collection, and log your reading progress.

## Features

- Search for books using the Google Books API
- Add books to your personal collection
- Track reading progress with logs
- View your reading statistics
- Responsive web interface

## Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher
- Node.js 16.x or higher (for frontend development)
- Google Books API key (get one from [Google Cloud Console](https://console.cloud.google.com/))

## Getting Started

### Backend Setup

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd book-reading-log
   ```

2. Create a `.env` file in the project root and copy the contents from `.env.example`:
   ```bash
   cp .env.example .env
   ```

3. Update the `.env` file with your Google Books API key and other configurations.

4. Build and run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

5. The backend will be available at `http://localhost:8080`

### Frontend Setup

1. Navigate to the frontend directory:
   ```bash
   cd frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the development server:
   ```bash
   npm start
   ```

4. The frontend will be available at `http://localhost:3000`

## Environment Variables

Create a `.env` file in the project root with the following variables:

```
# Google Books API Configuration
GOOGLE_BOOKS_API_KEY=your_google_books_api_key_here

# Database Configuration
SPRING_DATASOURCE_URL=jdbc:h2:file:./data/book_log_db;FILE_LOCK=FS
SPRING_DATASOURCE_USERNAME=sa
SPRING_DATASOURCE_PASSWORD=

# JPA/Hibernate Configuration
SPRING_JPA_HIBERNATE_DDL_AUTO=update
SPRING_JPA_SHOW_SQL=true

# H2 Console (for development)
SPRING_H2_CONSOLE_ENABLED=true
SPRING_H2_CONSOLE_PATH=/h2-console
```

## API Documentation

Once the application is running, you can access the following endpoints:

- **Swagger UI**: `http://localhost:8080/swagger-ui.html`
- **H2 Console**: `http://localhost:8080/h2-console`
  - JDBC URL: `jdbc:h2:file:./data/book_log_db`
  - Username: `sa`
  - Password: (leave empty)

## Security

### API Key Security

Never commit your Google Books API key to version control. The `.env` file is included in `.gitignore` to prevent accidental commits of sensitive information.

### Database Security

- The application uses an in-memory H2 database by default for development.
- For production, configure a persistent database by updating the `SPRING_DATASOURCE_URL` in your `.env` file.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot)
- [React](https://reactjs.org/)
- [Google Books API](https://developers.google.com/books)
- [H2 Database](https://www.h2database.com/)
