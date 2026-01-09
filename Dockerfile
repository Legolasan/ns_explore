FROM python:3.11-slim

WORKDIR /app

# Install dependencies
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy application code
COPY . .

# Make start script executable
RUN chmod +x start.sh

# Set default port (Railway will override with its own PORT)
ENV PORT=8080

# Expose port
EXPOSE 8080

# Use the start script
ENTRYPOINT ["./start.sh"]
