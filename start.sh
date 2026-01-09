#!/bin/sh
# Start script for Railway deployment

# Use PORT from environment, default to 8080
PORT="${PORT:-8080}"

echo "Starting NetSuite SDK Explorer on port $PORT"

exec uvicorn backend.app.main:app --host 0.0.0.0 --port "$PORT"
