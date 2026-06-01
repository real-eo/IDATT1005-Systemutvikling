import { useState } from 'react';
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from './ui/card';
import { Input } from './ui/input';
import { Button } from './ui/button';
import { Badge } from './ui/badge';

export function OrganizationsView() {
  const [searchQuery, setSearchQuery] = useState('');
  const [selectedCategory, setSelectedCategory] = useState('all');

  const categories = [
    { id: 'all', name: 'All Categories', count: 156 },
    { id: 'emergency', name: 'Emergency Relief', count: 42 },
    { id: 'children', name: 'Children\'s Aid', count: 38 },
    { id: 'education', name: 'Education', count: 29 },
    { id: 'health', name: 'Health', count: 25 },
    { id: 'environment', name: 'Environment', count: 22 },
  ];

  const organizations = [
    {
      name: 'Red Cross Norway',
      description: 'Humanitarian organization providing emergency relief and disaster response',
      category: 'Emergency Relief',
      verified: true,
      ikScore: 95,
      supporters: 15234,
      totalRaised: '125M NOK',
    },
    {
      name: 'UNICEF Norway',
      description: 'Supporting children\'s rights and wellbeing worldwide',
      category: 'Children\'s Aid',
      verified: true,
      ikScore: 98,
      supporters: 12567,
      totalRaised: '98M NOK',
    },
    {
      name: 'Save the Children Norway',
      description: 'Fighting for children\'s rights and providing immediate and lasting support',
      category: 'Children\'s Aid',
      verified: true,
      ikScore: 96,
      supporters: 11234,
      totalRaised: '87M NOK',
    },
    {
      name: 'Norwegian Refugee Council',
      description: 'Providing assistance to refugees and displaced people',
      category: 'Emergency Relief',
      verified: true,
      ikScore: 94,
      supporters: 9876,
      totalRaised: '72M NOK',
    },
    {
      name: 'Doctors Without Borders Norway',
      description: 'Providing medical care in crisis zones and conflict areas',
      category: 'Health',
      verified: true,
      ikScore: 97,
      supporters: 8765,
      totalRaised: '65M NOK',
    },
    {
      name: 'WWF Norway',
      description: 'Conservation organization working to protect wildlife and nature',
      category: 'Environment',
      verified: true,
      ikScore: 93,
      supporters: 7654,
      totalRaised: '54M NOK',
    },
  ];

  return (
    <div className="space-y-6">
      <div>
        <h1 className="text-3xl font-bold text-gray-900">Organizations</h1>
        <p className="text-gray-600 mt-1">Browse verified organizations and make a difference</p>
      </div>

      <div className="flex flex-col md:flex-row gap-4">
        <div className="flex-1 relative">
          <svg className="absolute left-3 top-1/2 -translate-y-1/2 w-5 h-5 text-gray-400" fill="none" stroke="currentColor" viewBox="0 0 24 24">
            <path strokeLinecap="round" strokeLinejoin="round" strokeWidth={2} d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z" />
          </svg>
          <Input
            type="text"
            placeholder="Search organizations..."
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
            className="pl-10"
          />
        </div>
        <Button variant="outline" className="whitespace-nowrap">
          <svg className="w-5 h-5 mr-2" fill="none" stroke="currentColor" viewBox="0 0 24 24">
            <path strokeLinecap="round" strokeLinejoin="round" strokeWidth={2} d="M3 4a1 1 0 011-1h16a1 1 0 011 1v2.586a1 1 0 01-.293.707l-6.414 6.414a1 1 0 00-.293.707V17l-4 4v-6.586a1 1 0 00-.293-.707L3.293 7.293A1 1 0 013 6.586V4z" />
          </svg>
          Filters
        </Button>
      </div>

      <div className="flex gap-2 overflow-x-auto pb-2">
        {categories.map((category) => (
          <button
            key={category.id}
            onClick={() => setSelectedCategory(category.id)}
            className={`px-4 py-2 rounded-lg text-sm font-medium whitespace-nowrap transition-colors ${
              selectedCategory === category.id
                ? 'bg-blue-600 text-white'
                : 'bg-gray-100 text-gray-700 hover:bg-gray-200'
            }`}
          >
            {category.name} ({category.count})
          </button>
        ))}
      </div>

      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
        {organizations.map((org, index) => (
          <Card key={index} className="hover:shadow-lg transition-shadow">
            <CardHeader>
              <div className="flex items-start justify-between mb-2">
                <div className="w-14 h-14 bg-gradient-to-br from-blue-500 to-blue-700 rounded-lg flex items-center justify-center">
                  <span className="text-2xl text-white font-bold">{org.name[0]}</span>
                </div>
                {org.verified && (
                  <Badge variant="default" className="bg-green-100 text-green-700 hover:bg-green-100">
                    <svg className="w-3 h-3 mr-1" fill="currentColor" viewBox="0 0 24 24">
                      <path d="M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z"/>
                    </svg>
                    IK Verified
                  </Badge>
                )}
              </div>
              <CardTitle className="text-xl">{org.name}</CardTitle>
              <CardDescription className="line-clamp-2">{org.description}</CardDescription>
            </CardHeader>
            <CardContent>
              <div className="space-y-3">
                <div className="flex items-center justify-between text-sm">
                  <span className="text-gray-600">Category</span>
                  <Badge variant="outline">{org.category}</Badge>
                </div>
                <div className="flex items-center justify-between text-sm">
                  <span className="text-gray-600">IK Score</span>
                  <span className="font-semibold text-green-600">{org.ikScore}/100</span>
                </div>
                <div className="flex items-center justify-between text-sm">
                  <span className="text-gray-600">Supporters</span>
                  <span className="font-semibold">{org.supporters.toLocaleString()}</span>
                </div>
                <div className="flex items-center justify-between text-sm">
                  <span className="text-gray-600">Total Raised</span>
                  <span className="font-semibold">{org.totalRaised}</span>
                </div>
                <div className="flex gap-2 mt-4">
                  <Button className="flex-1">Donate</Button>
                  <Button variant="outline" className="flex-1">Details</Button>
                </div>
              </div>
            </CardContent>
          </Card>
        ))}
      </div>

      <div className="flex justify-center">
        <Button variant="outline">Load More Organizations</Button>
      </div>
    </div>
  );
}
