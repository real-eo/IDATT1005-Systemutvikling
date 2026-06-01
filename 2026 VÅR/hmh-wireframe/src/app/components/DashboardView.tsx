import { Card, CardContent, CardDescription, CardHeader, CardTitle } from './ui/card';
import { Button } from './ui/button';
import { Progress } from './ui/progress';

export function DashboardView() {
  const recentDonations = [
    { org: 'Red Cross Norway', amount: 500, date: '2026-04-10', cause: 'Emergency Relief' },
    { org: 'UNICEF Norway', amount: 300, date: '2026-04-05', cause: 'Children\'s Aid' },
    { org: 'Save the Children', amount: 200, date: '2026-03-28', cause: 'Education' },
  ];

  const favoriteCauses = [
    { name: 'Emergency Relief', orgs: 12, donated: 1200, goal: 2000 },
    { name: 'Children\'s Aid', orgs: 8, donated: 800, goal: 1500 },
    { name: 'Education', orgs: 5, donated: 400, goal: 1000 },
  ];

  return (
    <div className="space-y-6">
      <div className="flex items-center justify-between">
        <div>
          <h1 className="text-3xl font-bold text-gray-900">Dashboard</h1>
          <p className="text-gray-600 mt-1">Your donation overview and impact</p>
        </div>
      </div>

      <div className="grid grid-cols-1 md:grid-cols-3 gap-6">
        <Card>
          <CardHeader className="pb-3">
            <CardDescription>Total Donated</CardDescription>
            <CardTitle className="text-3xl">4,200 NOK</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-600">Across 25 organizations</p>
          </CardContent>
        </Card>

        <Card>
          <CardHeader className="pb-3">
            <CardDescription>This Month</CardDescription>
            <CardTitle className="text-3xl">1,000 NOK</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-600">+25% from last month</p>
          </CardContent>
        </Card>

        <Card>
          <CardHeader className="pb-3">
            <CardDescription>Organizations Supported</CardDescription>
            <CardTitle className="text-3xl">25</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-600">All IK verified</p>
          </CardContent>
        </Card>
      </div>

      <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
        <Card>
          <CardHeader>
            <CardTitle>Recent Donations</CardTitle>
            <CardDescription>Your latest contributions</CardDescription>
          </CardHeader>
          <CardContent>
            <div className="space-y-4">
              {recentDonations.map((donation, index) => (
                <div key={index} className="flex items-center justify-between p-3 bg-gray-50 rounded-lg">
                  <div className="flex items-center gap-3">
                    <div className="w-10 h-10 bg-red-100 rounded-full flex items-center justify-center">
                      <svg className="w-5 h-5 text-red-600" fill="currentColor" viewBox="0 0 24 24">
                        <path d="M12 21.35l-1.45-1.32C5.4 15.36 2 12.28 2 8.5 2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 2.09C13.09 3.81 14.76 3 16.5 3 19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54L12 21.35z"/>
                      </svg>
                    </div>
                    <div>
                      <p className="font-medium text-gray-900">{donation.org}</p>
                      <p className="text-sm text-gray-600">{donation.cause}</p>
                    </div>
                  </div>
                  <div className="text-right">
                    <p className="font-semibold text-gray-900">{donation.amount} NOK</p>
                    <p className="text-sm text-gray-600">{donation.date}</p>
                  </div>
                </div>
              ))}
            </div>
            <Button variant="outline" className="w-full mt-4">
              View All Donations
            </Button>
          </CardContent>
        </Card>

        <Card>
          <CardHeader>
            <CardTitle>Favorite Causes</CardTitle>
            <CardDescription>Track your impact by cause</CardDescription>
          </CardHeader>
          <CardContent>
            <div className="space-y-6">
              {favoriteCauses.map((cause, index) => (
                <div key={index} className="space-y-2">
                  <div className="flex items-center justify-between">
                    <div>
                      <p className="font-medium text-gray-900">{cause.name}</p>
                      <p className="text-sm text-gray-600">{cause.orgs} organizations</p>
                    </div>
                    <p className="text-sm font-semibold">{cause.donated} / {cause.goal} NOK</p>
                  </div>
                  <Progress value={(cause.donated / cause.goal) * 100} className="h-2" />
                </div>
              ))}
            </div>
            <Button variant="outline" className="w-full mt-4">
              Manage Causes
            </Button>
          </CardContent>
        </Card>
      </div>

      <Card>
        <CardHeader>
          <CardTitle>Recommended Organizations</CardTitle>
          <CardDescription>Based on your donation history and interests</CardDescription>
        </CardHeader>
        <CardContent>
          <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
            {['Norwegian Refugee Council', 'Doctors Without Borders', 'WWF Norway'].map((org, index) => (
              <div key={index} className="p-4 border rounded-lg hover:border-blue-500 transition-colors">
                <div className="w-12 h-12 bg-blue-100 rounded-lg mb-3 flex items-center justify-center">
                  <span className="text-2xl">🌍</span>
                </div>
                <h3 className="font-semibold mb-1">{org}</h3>
                <p className="text-sm text-gray-600 mb-3">Emergency relief and humanitarian aid</p>
                <div className="flex items-center gap-1 text-xs text-green-600 mb-3">
                  <svg className="w-4 h-4" fill="currentColor" viewBox="0 0 24 24">
                    <path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/>
                  </svg>
                  <span>IK Verified</span>
                </div>
                <Button size="sm" className="w-full">Learn More</Button>
              </div>
            ))}
          </div>
        </CardContent>
      </Card>
    </div>
  );
}
