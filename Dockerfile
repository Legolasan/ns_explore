FROM python:3.11-slim

WORKDIR /app

# Install dependencies
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy application code
COPY . .

# Set default port (Railway will override with its own PORT)
ENV PORT=8080

# Expose port
EXPOSE 8080

# Use explicit shell to expand $PORT
CMD ["/bin/sh", "-c", "uvicorn backend.app.main:app --host 0.0.0.0 --port ${PORT}"]
