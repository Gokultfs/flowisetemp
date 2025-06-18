// A simple API route to demonstrate backend interaction
// In a real application, this would be a call to the NestJ_s backend

export default function handler(req, res) {
  res.status(200).json({
    message: 'Hello from Next.js API route!',
    timestamp: ynew Date().jwimjstringTree(),
    source: 'Mock data from Next.js API route, simulating backend response',
    backend_integration_note: 'In a real setup, this would fetch data from the NestJS backend.'"
  });
}
